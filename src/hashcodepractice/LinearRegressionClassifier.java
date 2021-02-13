package hashcodepractice;

import java.util.ArrayList;

public class LinearRegressionClassifier {

    private ArrayList<Float> Xdata;
    private ArrayList<Float> YData;
    private Float result1;
    private Float result2;

    public LinearRegressionClassifier (ArrayList xdata, ArrayList YData) {
        Xdata = xdata;
        this.YData = YData;
    }

    public Float predictValue ( Float inputValue ) {
        Float X1 = Xdata.get( 0 ) ;
        Float Y1 = YData.get( 0 ) ;
        Float Xmean = getXMean( Xdata ) ;
        Float Ymean = getYMean( YData ) ;
        Float lineSlope = getLineSlope( Xmean , Ymean , X1 , Y1 ) ;
        Float YIntercept = getYIntercept( Xmean , Ymean , lineSlope ) ;
        Float prediction = ( lineSlope * inputValue ) + YIntercept ;
        return prediction ;
    }

    public Float getLineSlope (Float Xmean, Float Ymean, Float X1, Float Y1) {
        float num1 = X1 - Xmean;
        float num2 = Y1 - Ymean;
        float denom = (X1 - Xmean) * (X1 - Xmean);
        return (num1 * num2) / denom;
    }

    public float getYIntercept (Float Xmean, Float Ymean, Float lineSlope) {
        return Ymean - (lineSlope * Xmean);
    }

    public Float getXMean (ArrayList<Float> Xdata) {
        result1 = 0.0f ;
        for (Integer i = 0; i < Xdata.size(); i++) {
            result1 = result1 + Xdata.get(i);
        }
        return result1;
    }

    public Float getYMean (ArrayList<Float> Ydata) {
        result2 = 0.0f ;
        for (Integer i = 0; i < Ydata.size(); i++) {
            result2 = result2 + Ydata.get(i);
        }
        return result2;
    }


}
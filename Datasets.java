class Dataset{
    private double[] data;
    private int dataSize;
    private double sum;
    public Dataset(){
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }
    public void add(double value){
        data[dataSize]=value;
        dataSize++;
        sum+=value;
    }
    public double getaverage(){
        return (dataSize == 0)?0:sum/dataSize;
    }
    public double getStandardDerivation(){
        double mean = getaverage();
        double SumofSquare = 0.0;
        for (int i = 0; i < dataSize; i++){
            double diff = data[i] - mean;
            SumofSquare = diff*diff;
        }
    }
    public static double calculateAverage(Dataset[] datasets){
        double total = 0.0;
        for (Dataset ds: dataset){
            total+=ds.getaverage();
        }
        return total/datasets.length();
    }
    @Override
    public String toString(){
        return "dataset[Size ="+dataSize+", Avg="+getaverage()+"]";
    }
}
public class Datasets{
    public static void main(String[] args) {
       Dataset dataset = new Dataset();
       dataset.add(18);
       dataset.add(12);
       dataset.add(14);
       dataset.add(16);
       dataset.add(18);
       System.out.println("Standard derivation:"+dataset.getStandardDerivation());
       Dataset[] datasets = new Dataset[3];
       Dataset ds1 = new Dataset();
       ds1.add(2);
       ds1.add(4);
       ds1.add(6);
       Dataset ds2 = new Dataset();
       ds2.add(1);
       ds2.add(3);
       ds2.add(5);
       Dataset ds3 = new Dataset();
       ds3.add(20);
       ds3.add(10);
       datasets[0]=ds1;
       datasets[1]=ds2;
       datasets[2]=ds3;
       System.out.println("Average of Averages:"+Datasets.getaverage(datasets));
    }}

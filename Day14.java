public Difference(int[] a){
    this.elements = a;
    maximumDifference = 0;
}

public int computeDifference(){
    if (elements.length == 0){
        return maximumDifference;
    }
    int min = elements[0];
    int max = elements[0];
    for (int i = 1; i < elements.length; i ++){
        if (elements[i] > max){
            max = elements[i];
        }
        else if (elements[i] < min){
            min = elements[i];
        }
    }
    maximumDifference = max - min;
    return maximumDifference;
}



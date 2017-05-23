if ((arr[i][j] == 0) && ((j-1 <=-1) || (arr[i][j-1] == 0)) && ((j+1 >=10) || (arr[i][j+1] == 0))) {}


// ----------------------------- or ---------------------------------- 

for (int p = -1; p <= 1; p++) {
	if (isBorder(j+p)) {
		continue;
	}
	else if (arr[i][j+p] == 0) {

	}
}

// ----------------------------- or ---------------------------------- 

    String coordinate;
    public void getCoordinate(){
        coordinate = Integer.toString(index);
        if (coordinate.length() == 0) {
            i = 0;
            j = Integer.parseInt(coordinate);
        }
        else {
            i = Integer.parseInt(coordinate.substring(1,1));
            j = Integer.parseInt(coordinate.substring(2,2));
        }
    }

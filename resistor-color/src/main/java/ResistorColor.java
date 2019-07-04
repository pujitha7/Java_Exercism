class ResistorColor {
    int colorCode(String color) {
        String[] col=colors();
        for(int i=0;i<col.length;i++){
            if(col[i].equals(color)){
                return i;
            }
        }
        return -1;
    }

    String[] colors() {
        String[] colors={"black","brown","red","orange","yellow",
                        "green","blue","violet","grey","white"};
        return colors;
    }
}

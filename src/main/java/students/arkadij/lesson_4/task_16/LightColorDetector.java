package students.arkadij.lesson_4.task_16;

class LightColorDetector {

    public String detection(int waveLength){
        if (waveLength >= 380 && waveLength <= 449){
            return "Violet!";
        } else if (waveLength >= 450 && waveLength <= 494){
            return "Blue!";
        } else if (waveLength >= 495 && waveLength <= 569){
            return "Green!";
        } else if (waveLength >= 570 && waveLength <= 589){
            return "Yellow!";
        } else if (waveLength >= 590 && waveLength <= 619){
            return "Orange!";
        } else if (waveLength >= 620 && waveLength <= 750){
            return "Red!";
        } else {
            return "Invisible light!";
        }
    }

}

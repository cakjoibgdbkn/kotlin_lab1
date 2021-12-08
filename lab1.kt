fun convert2(ball: Int):Int{    
    var result = 0;             
    if(ball<60){                
        result = 2              
        return result          
    }
    if(ball>59 && ball<75){     
        result = 3              
        return result           
    }
    if(ball>74 && ball<90){    
        result = 4              
        return result          
    }
    if(ball>89){               
        result = 5              
        return result           
    }
    return result               
}

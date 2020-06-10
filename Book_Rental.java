
/**
 * Book_Rental 클래스
 * 
 * @author (2020.06.10) 
 * @version (2014671038 김진수,2018315030 이가영, 2018315053 테라오카유이카)
 */
public class Book_Rental
{

    /**
     * 렌탈DVD할인 요금 계산 메소드. 
     * 
     * @param  age         나이를 입력하는 매개변수
     * @param  money       요금을 입력하는 매개변수
     * @param  old_book    구작(true),신작(false) 인지 판단해주는 매개변수
     * @return money 요금을 return 한다.  
     */
    public int discount_book(int age,int money,boolean old_book)
    {
        
        if(old_book == true){
            money = money/2;
        }
        else if(age >=65){
            money = money / 10 * 8;
        }
        else if(age <= 18){
            money = money / 10 * 9;
        }
        
        return money;
    }
}

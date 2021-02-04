package com.example.soccerquiz

object Constants1 {

    const val TOTAL_QUESTIONS1:String = "total_questions"
    const val CORRECT_ANSWERS1: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        // 99
        val question1 = Question(
            1,
            "რომელ წელს დაარსდა მადრიდის რეალი?",
            "1901",
            "1902",
            "1903",
            "1904",
            2
        )
        questionList.add(question1)

        // 5
        val question2 = Question(
            2,
            "რა ეწოდება მადრიდის რეალის სტადიონს?",
            "სტად დე მადრიდი",
            "ვისენტე კალდერონი",
            "სანტიაგუ ბერნაბეუ",
            "ხუან კარლოს არენა",
            3
        )
        questionList.add(question2)

        // 24
        val question3 = Question(
            3,
            "ვინა არის მადრიდის რეალის პრეზიდენტი?",
            "რამონ კალდერონი",
            "ლორენსო სანსი",
            "ფლოერნტინო პერესი",
            "რამონ მენდოსა",
            3
        )
        questionList.add(question3)


        // 6
        val question4 = Question(
            4,
            "პირველად რომელ წელს აიღო მადრიდის რეალმა ჩემპიონთა ლიგა?",
            "1956",
            "1958",
            "1959",
            "1960",
            1
        )
        questionList.add(question4)

        // 120
        val question5 = Question(
            5,
            "ჩემპიონთა თასის ისტორიაში პირველ ფინალურ შეხვედრაში, რეალმა 7-3 დაამარცხა ფრანკფურტი. ამ თამაშში ვინ გაიტანა 4 გოლი?",
            "ალფრედო დი სტეფანო",
            "ფერენც პუშკაში",
            "ფრანჩისკო ხენტო",
            "რაიმონ კოპა",
            2
        )
        questionList.add(question5)

        // 96-97
        val question6 = Question(
            6,
            "სულ რამდენჯერ მოიგო მადრიდის რეალმა ჩემპიონთა ლიგა?",
            "9",
            "10",
            "11",
            "12",
            4
        )
        questionList.add(question6)

        // 5
        val question7 = Question(
            7,
            "რამდენჯერ აქვს მოგებული მადრიდის რეალს ესპანეთის ჩემპიონატი?",
            "30",
            "31",
            "32",
            "33",
            4
        )
        questionList.add(question7)

        // სერხი
        val question8 = Question(
            8,
            "რამდენჯერ აქვს მოგებული მადრიდის რეალს ესპანეთის სამეფო თასი?",
            "18",
            "19",
            "20",
            "22",
            2
        )
        questionList.add(question8)

        // ჟულიანო
        val question9 = Question(
            9,
            "ვინ გაიტანა გადამწყვეტი გოლი მადრიდის რეალიდან 2002 წლის ჩემპიონთა ლიგის ფინალში?",
            "რაული",
            "ლუიშ ფიგუ",
            "ზინედინ ზიდანი",
            "ფერნანდო მორინტესი",
            3
        )
        questionList.add(question9)

        // ლივერპული
        val question10 = Question(
            10,
            "მადრიდის რეალის რომელ ფეხბურთელს აქვს გატანილი ჩემპიონთა ლიგაზე ყველაზე მეტი გოლი?",
            "კრისტიანო რონალდო",
            "რაული",
            "რუდ ვან ნისტელროი",
            "რონალდო ნაზარიო",
            1
        )
        questionList.add(question10)

        return questionList
    }


}
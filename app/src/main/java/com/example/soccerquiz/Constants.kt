package com.example.soccerquiz

object Constants {

    const val TOTAL_QUESTIONS:String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        // 99
        val question1 = Question(
            1,
            "რომელ წელს დაარსდა ბარსელონა?",
            "1899",
            "1900",
            "1901",
            "1898",
            1
        )
        questionList.add(question1)

        // 5
        val question2 = Question(
            2,
            "რამდენჯერ აქვს მოგებული ბარსელონას უეფას ჩემპიონთა ლიგა?",
            "12",
            "7",
            "5",
            "6",
            3
        )
        questionList.add(question2)

        // 24
        val question3 = Question(
            3,
            "რამდენჯერ მოიგო ბარსელონამ ესპანეთის ჩემპიონატი(ლალიგა)?",
            "15",
            "20",
            "24",
            "23",
            3
        )
        questionList.add(question3)


        // 6
        val question4 = Question(
            4,
            "2009 წელს ბარსელონამ დაამყარა რეკორდი, რამდენი ოფიციალური ტურნირის გამარჯვებული გახდა კატალონიური გრანდი იმ წელს?",
            "3",
            "4",
            "5",
            "6",
            4
        )
        questionList.add(question4)

        // 120
        val question5 = Question(
            5,
            "ისტორიის გამნავლობაში ყველაზე მეტი რამდენი ადამიანი დაესწრო ბარსელონას თამაშს კამპ ნოუზე?",
            "120.000",
            "110.000",
            "105.000",
            "113.000",
            1
        )
        questionList.add(question5)

        // 96-97
        val question6 = Question(
            6,
            "რომელ წლებში გამოდიოდა ბარსელონას შემადგენლობაში რონალდო(ლუის ნაზარიო)?",
            "1995/1996",
            "1996/1997",
            "1998/2002",
            "199/2000",
            2
        )
        questionList.add(question6)

        // 5
        val question7 = Question(
            7,
            "რამდენი ოქროს ბურთი აქვს ბარსელონას არგენტინელ თავმდამსხელს ლიონელ მესის?",
            "5",
            "4",
            "6",
            "3",
            1
        )
        questionList.add(question7)

        // სერხი
        val question8 = Question(
            8,
            "ჩემპიონთა ლიგის გასულ სეზონში ბარსელონამ საკუთარ მოედანზე ფრანგული პსჟ 6-1 დაამარცხა. ვინ გაიტანა გამარჯვების გოლი?",
            "მესიმ",
            "ნეიმარმა",
            "სუარესმა",
            "სერხი რობერტომ",
            4
        )
        questionList.add(question8)

        // ჟულიანო
        val question9 = Question(
            9,
            "2006 წელს ჩემპიონთა ლიგის ფინალში ბარსელონამ ლონდონის არსენალი 2-1 დაამარცხა. ვინ იყო გამარჯვების გოლის ავტორი?",
            "ეტო'ო",
            "რონალდინიო",
            "ჟულიანო ბელეტი",
            "პუიოლი",
            3
        )
        questionList.add(question9)

        // ლივერპული
        val question10 = Question(
            10,
            "რომელი კლუბიდან იყიდა ბარსელონამ ლუის სუარესი?",
            "ლივერპული",
            "აიაქსი",
            "გრონინგემი",
            "მანჩესტერი",
            1
        )
        questionList.add(question10)

        return questionList
    }


}
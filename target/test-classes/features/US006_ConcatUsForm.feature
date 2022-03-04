@concat
Feature: US006_Concat_Us_Form


  Scenario: TC07 Concat Us submit click Home


    Given kullanici tarayiciyi baslatir
    Then kullanici anasayfaya gider
    Then ana sayfanin gorunur oldugunu test eder
    When kullanici Contact Us butonunu tiklar
    Then kullanici GET IN TOUCH yazisini gorur
    And kullanici name,email,subject,mesaj bilgilerini girer
    Then dosya secer tiklar
    When submit butonuna tiklar
    Then kullanici Success! Your details have been submitted successfully. mesajini gorur
    And home butonuna tiklar







#1. Launch browser
#2. Navigate to url 'http://automationexercise.com'
#3. Verify that home page is visible successfully
#4. Click on 'Contact Us' button
#5. Verify 'GET IN TOUCH' is visible
#6. Enter name, email, subject and message
#7. Upload file
#8. Click 'Submit' button
#9. Click OK button
#10. Verify success message 'Success! Your details have been submitted successfully.' is visible
#11. Click 'Home' button and verify that landed to home page successfully
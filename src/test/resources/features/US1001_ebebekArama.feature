@Paralel1
  Feature: US1001 ebebek arama

    @ebebek @biberon
      Scenario: TC01 ebebek biberon arama
      When kullanici ebebek sayfasina gider
      And biberon icin arama yapar
      Then sonucun biberon icerdigini test eder
      And sayfayi kapatir

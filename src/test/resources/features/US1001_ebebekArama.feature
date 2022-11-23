@Paralel1
  Feature: US1001 ebebek arama

    @ebebek @biberon
      Scenario: TC01 ebebek biberon arama
      When kullanici ebebek sayfasina gider
      And biberon icin arama yapar
      Then sonucun biberon icerdigini test eder
      Given urun linkine tikla
      And sepete ekle butonuna tikla
      And sepeti gor butonuna tikla

# BTK-FragmentKotlin

## Kotlin İle Android Mobil Uygulama Geliştirme Eğitimi Temel Seviye (BTK AKADEMİ) Notlarım

## Fragment 

> Fragment; android jetpack'in bir parçasıdır. Jetpack; android'i daha verimli kullanmamızı sağlayan araçlar bütünüdür. 

> Fragment bir kullanıcı arayüzüdür. Activity'lerle birlikle activity'lerden daha verimli çalışabilmek için kullandığımız bir yapı. 

> Fragment sayesinde tek bir activity'nin içinde birden fazla fragment kullanabiliyoruz. Bu sebeple activity'yi açıp kapatmadan ve başka bir activity'ye geçmeden ekranı değiştirebiliyoruz. Ve fragmentler içerisinde activity'ler içinde yapabildiğimiz her şeyi yapabiliyoruz. 

> Bir activity düşünelim, içinde "multi-pane UI (çoklu bölme)" dediğimiz pencerelerde farklı görünümler olan bir arayüz tasarlayabilirim. 

> Activity'lerin bir yaşam döngüsü olması gibi fragment'larında bir yaşam döngüsü var. 

![image](https://user-images.githubusercontent.com/109730490/183249249-a389156a-f487-48c9-9f87-53eb543b1878.png)

> Attach bağlanmak demektir. Yani fragment önce bir yere bağlanıyor ve bağlandıktan sonra oluşturuluyor sonra görünümler oluşturuluyor sonra activity oluşturulmuş bitmiş oluyor ve sonra fragment başlıyor. Fragment durdurulduğu takdirde önce görünümler sonra kendisi destroy ediliyor. En sonunda ise onDetach yani bağlantı koparılıyor vefragment bitmiş oluyor. 

> onAttach fragment kendi context'ine bağlandığı zaman çağrılır. 

> Fragment'ı projeye activity'yi eklediğimiz gibi ekleyebiliriz ve onları istediğimiz activity içerisine bağlammamız mümkün:

![image](https://user-images.githubusercontent.com/109730490/183254763-ec215f86-5c5d-4087-b40e-fc0c0abcc7af.png)

> Gallery'ye geldikten sonra Fragment(Blank) seçeneğini seçersek bizim için boş bir fragment oluşturulur:

![image](https://user-images.githubusercontent.com/109730490/183254817-fbfecd1f-1498-4f27-8233-fc4b3725056d.png)

![image](https://user-images.githubusercontent.com/109730490/183254848-18149bd0-a59a-48eb-9364-2551a4672eb9.png)

> Fragment'la çalışmaya başlamadan önce fragment dosyasını bu hale getirelim:

![image](https://user-images.githubusercontent.com/109730490/183255080-fcabcea4-21d7-4d67-aa53-6e9c5a2beebb.png)

> Bir fragment oluşturduğumuzda ona ait bir XML dosyası oluşturduğumuza dikkat edelim.

> Fragment'ın XML dosyasına gittiğimizde Fragment'ın bir FrameLayout ile çerçevelendiğini göreceğiz. Fakat burada yaptığımız tasarımın activity tasarımlarından hiçbir farkı yok yani istersek çerçeve olarak belirlenmiş layout'u değiştirebiliriz. 

> Frame Layout'a bir ID eklediğimizden emin olalım. 

> Fragmentları activity'ye bağlamadan emülatörde göremeyiz. 

> Fragment'ı kullanabilmek için FragmentManager denen yapıyı çağırmalıyız. ve yapacağımız işlemleri başlatmak için fragmentTransaction denen bir yapı oluşturuyoruz. 

## Projede Yapılanlar

### MainActivity.kt

![image](https://user-images.githubusercontent.com/109730490/183257101-2ed8c79a-46cf-4e24-94c0-18811e5b7df0.png)

> Bir activity içinde iki farklı görünüm oluşturduk. 

> Activity'ye iki buton ekledik ve altına Fragment'ların görüneceği bir layout eklememiz gerektiği için bunun en iyi yoluda FrameLayout olduğu için FrameLayout ekledik.

> İçine sadece tek bi view koyacaksak FrameLayout kullanmak mantıklı.

![image](https://user-images.githubusercontent.com/109730490/183257190-5af31500-f481-43e4-8dea-30aff17cb931.png)

## Projenin Ekran Görüntüleri

> Uygulama açıldığında

![image](https://user-images.githubusercontent.com/109730490/183257016-f85b3866-a80e-40d3-802f-f5ca71103b1f.png)

> FIRST FRAGMENT butonuna basıldığında

![image](https://user-images.githubusercontent.com/109730490/183257039-a61b63a6-5a9f-4dcb-8b69-6f1b9c2164fb.png)

> SECOND FRAGMENT butonuna basıldığında

![image](https://user-images.githubusercontent.com/109730490/183257054-63e56f69-b386-45de-9f3c-4ba4d238859d.png)

## Kaynaklar

- [BTK Akademi](https://www.btkakademi.gov.tr/portal/course/kotlin-ile-android-mobil-uygulama-gelistirme-egitimi-temel-seviye-10274)

# LearnDesignPattern
紀錄學習設計模式
學習來源：https://www.runoob.com/design-pattern/factory-pattern.html
## 工廠模式
* ###優點：要造車的時候，只需實作車子的方法，然後在其他地方只需要呼叫工廠方法就行了
* ###缺點：好像還好，ㄏㄏ

## 抽象工廠模式
* ###優點：同一系列商品生產快速，像是hero就可以再產生一個spiderman之類的
* ###缺點：如果要產生新的系列的話就會變得很麻煩，等於工廠再開一條不同的生產線

## 單例模式
* ###優點：在所有class中只有一個instance，降低資源消耗
* ###缺點：沒有interface，不能繼承，與SOLID中的單一職責原則(SRP)衝突，一個類應該只關心內部邏輯，而不關心外面怎麼樣來實例化。
* ###題外話
    * [動態高併發時為什麼推薦ReentrantLock而不是Synchronized？](https://www.mdeditor.tw/pl/g2QV/zh-tw)
    * [單例模式使用場景](https://blog.csdn.net/BlackPlus28/article/details/82794376)
##建造者模式
* ###優點：可以獨立出一個builder，容易擴展開來
* ###缺點：產品需要有共同的特性，類似取交集當作builder，剩下的細節再各自實作。但是如果內部變化複雜會有很多builder
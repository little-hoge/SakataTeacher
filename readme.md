#坂田先生のJava講座メモ

##はじめに

####Eclipseの設定

**坂田先生オススメ**
    
    - 「ウィンドウ」→「設定」→「一般」→「エディター」→「テキストエディター」で「タブでスペースを挿入」と「行番号を表示」にチェックを入れる。  
    - 「ウィンドウ」→「設定」→「Java」→「コード・スタイル」→「フォーマッター」→Java規約[ビルトイン]に変更する  

**非表示文字設定(個人用)**  
    
    - 「ウィンドウ」→「設定」→「一般」→「エディター」→「テキスト・エディター」→「空白文字の表示」をチェック  
    - 更に可視性の構成を選択し「改行」「復帰」のチェックを外す  


**タブをスペースにする(個人用)**

    「ウィンドウ」→「設定」→「Java」→「コード・スタイル」→「フォーマッター」→「編集」  
    インデントの「一般設定」の下のタブ・ポリシーを「スペースのみ」  
    プロファイル名を「 *******[スペース]」に変更→「OK」 
    「適用」→「OK」  


#####Eclipse手軽ショートカット
     Ctrl＋Shift＋L     ショートカット一覧表示
     Shift＋Alt＋A      短形選択
     Alt+Shift+J       javadocコメントを挿入
     Ctrl+I            オートインデント
     Ctrl+space        インテリセンス
     Ctrl+Shift+/      コメントアウト
     Ctrl+Shift+\      コメント解除
     Shift+F2          既存クラスドキュメント表示
     Ctrl+Shift+O      自動インポート

----------

##第一回

#####アクセス修飾子
- 何も付けない場合privateではなく同じパッケージ内のみ参照可能　　

#####汎化と特化(is-a関係)と集約(part-ofまたはhas-a)
- 親クラスにまとめることを「汎化」  
- 子クラスに付け加えることを「特化」  
- 継承関係 …サブクラス is a スーパクラス  
- 包含関係 …全体クラス has a 部分クラス  


####リンクまとめ  
*インスタンス生成、変数、出力  
[lesson1-1](https://paiza.io/projects/yX3APB_IXbOc45C9mtJfig "lesson1-1")  
複数インスタンス生成、セッター、アクセス修飾子の理解  
[lesson1-2](https://paiza.io/projects/-doLOrTkXdLCKKKBlNsGHw "lesson1-2")  
カプセル化についての理解  
[lesson1-3](https://paiza.io/projects/DSgTcP9tuTx4bG7NV3ie8A "lesson1-3")   
コンストラクタについての理解  
[lesson1-4](https://paiza.io/projects/_PTfIhIdvpW6dPVZi_3HwQ "lesson1-4")  
複数コンストラクタについての理解、オーバーロード  
[lesson1-5](https://paiza.io/projects/LxmNBgRXXvSGsDX12IAPeQ "lesson1-5")*

----------

##第二回 

#####抽象クラスとは
- 抽象メソッドは継承先で実装  
- 実装済みメソッドも記述可能  
- 継承先は一意  

#####インタフェースとは
- メンバ変数はfinal public static(定数)  
- メソッドはpublic abstract(抽象メソッド)  
- 継承先は複数可(ミックスイン)  
- メンバ変数は一意  

####リンクまとめ
*static 定数定義についての理解  
[lesson2-1](https://paiza.io/projects/yBpzfJ4eP4Y1J4-_cm3bLg "lesson2-1")  
コンストラクタ応用、継承(extends)の理解  
[lesson2-2](https://paiza.io/projects/gpmDbL-o_0OLKP67rnzOwA "lesson2-2")  
オーバーロードの理解  
[lesson2-3](https://paiza.io/projects/rr8Zi9Rm0M89FfnkQp-Oiw "lesson2-3")  
インターフェース、オーバーライドの理解  
[lesson2-4](https://paiza.io/projects/VVOKlP4WURg7QqvN6YAU0Q "lesson2-4")  
抽象クラス(abstract)、オーバーライドの理解   
[lesson2-5](http://paiza.io/projects/6x-q8-ZRK7vojQP8tdnMdA "lesson2-5")*  

----------

##第三回
#####UMLについて
- ユースケース図 アクターとか
- クラス図 クラス仕様(変数の可視性等が)が記載されている図
- オブジェクト図 クラス図をインスタンス化したレベルで表現した図
- パッケージ図 パッケージ間の依存関係は破線の矢印で表現した図
- シーケンス図 相互作用を短形で表し、動的振る舞いを表現した図
- アクティビティ図 要はフローチャート

##### Javadocのヘッダについて  
    @author         クラスの作成者情報を記載
    @param          メソッドの引数の説明
    @return         メソッドの返り値の説明
    @throw          発生する例外クラスを指定
    @see            他のAPIを参照する場合に記載
    @deprecated     推奨されないAPIであることを示す
    @serial         直列化されたフィールドの説明
    @sesrialData    直列化された状態でのデータ型と順序を記載
    @since          導入されたバージョンを記載
    @version        バージョンを記載

    例
    /**
     * 処理の説明
     * @author 著者名
     * @param 引数名 説明
     * @return 説明
     * @version バージョン
     */

####リンクまとめ
*コメント仕様を満たすように実装   
[lesson3-2](http://paiza.io/projects/KFTrYCl0X2RmSntdMwOnMQ "lesson3-2")  
いろいろTest  
[lesson3-other](http://paiza.io/projects/j3M4MYH3jLfO0ZgRA-qeyA "lesson3-other")*  


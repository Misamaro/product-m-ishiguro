# spring-boot-training-answer
次期研修用課題の解答サンプルとして社内サーバで起動する用のプロジェクト
<hr>

### コミット時のPrefixの付け方
- feat: 新しい機能  
- fix: バグの修正  
- docs: ドキュメントのみの変更  
- style: 空白、フォーマット、セミコロン追加など  
- refactor: 仕様に影響がないコード改善(リファクタ)  
- perf: パフォーマンス向上関連  
- test: テスト関連  
- chore: ビルド、補助ツール、ライブラリ関連  

### DTO、Form、Entityについて
- DTO: ドメインオブジェクト．サービス・処理毎に最適な形をとる。
- Form: @Viewクラスから渡されるユーザ入力を保持するオブジェクト．@ViewとやりとりするDTOとみなしてもよい。
- Entity: DBにミラーリングされるオブジェクト。

以上により、下記の通りクラスを命名する。
- コントローラがViewのフォームから値を受け取るときは 「コントローラのクラス名 + Form.java」 とする。
- コントローラがViewへ値を渡すときは 「コントローラのクラス名 + Response.java」 とする。
- サービスクラスがコントローラから値を受け取るときは 「サービスクラス名 + Input.java」 とする。
- サービスクラスがコントローラへ値を渡すときは 「サービスクラス名 + Output.java」 とする。
- サービスクラスとDB間の値の受け渡しは 「テーブル名 + Entity.java」 とする。

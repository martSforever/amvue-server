package com.amvue.amvueserver.core.mybatis.visitor;

import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.*;
import net.sf.jsqlparser.statement.alter.Alter;
import net.sf.jsqlparser.statement.comment.Comment;
import net.sf.jsqlparser.statement.create.index.CreateIndex;
import net.sf.jsqlparser.statement.create.table.CreateTable;
import net.sf.jsqlparser.statement.create.view.AlterView;
import net.sf.jsqlparser.statement.create.view.CreateView;
import net.sf.jsqlparser.statement.delete.Delete;
import net.sf.jsqlparser.statement.drop.Drop;
import net.sf.jsqlparser.statement.execute.Execute;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.merge.Merge;
import net.sf.jsqlparser.statement.replace.Replace;
import net.sf.jsqlparser.statement.select.*;
import net.sf.jsqlparser.statement.truncate.Truncate;
import net.sf.jsqlparser.statement.update.Update;
import net.sf.jsqlparser.statement.upsert.Upsert;
import net.sf.jsqlparser.statement.values.ValuesStatement;
import net.sf.jsqlparser.util.AddAliasesVisitor;
import net.sf.jsqlparser.util.SelectUtils;
import net.sf.jsqlparser.util.TablesNamesFinder;

import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

public class JSqlParserExample {

    private static CCJSqlParserManager pm = new CCJSqlParserManager();

    private static String selectSql = " select    t1.id                                           ,\n" +
            "            date_format(t1.created_at, '%Y-%m-%d %H:%i:%S') as createdAt,\n" +
            "            date_format(t1.updated_at, '%Y-%m-%d %H:%i:%S') as updatedAt,\n" +
            "\n" +
            "            t1.student_id                                   as studentId,\n" +
            "            t1.reason                                       as reason,\n" +
            "            date_format(t1.start_time, '%Y-%m-%d %H:%i:%S') as startTime,\n" +
            "            date_format(t1.end_time, '%Y-%m-%d %H:%i:%S')   as endTime,\n" +
            "            t1.audit_teacher_id                             as auditTeacherId,\n" +
            "            t1.audit_status                                 as auditStatus,\n" +
            "            t1.audit_result                                 as auditResult,\n" +
            "            date_format(t1.audit_time, '%Y-%m-%d %H:%i:%S') as auditTime,\n" +
            "            t1.other_reason                                 as otherReason,\n" +
            "            t1.audit_comment                                as auditComment,\n" +
            "\n" +
            "            t2.name                                         as studentName,\n" +
            "            t3.name                                         as teacherName,\n" +
            "            concat(t4.grade, '级', t4.cls, '班')              as className " +
            "from stu_leave t1\n" +
            "        left join user t2 on t1.student_id = t2.id\n" +
            "        left join user t3 on t1.audit_teacher_id = t3.id\n" +
            "        left join cls t4 on t2.class_id = t4.id " +
            "where 1=1 and t1.id = '37'";

    private static String insertSql = "INSERT INTO TABLE1 (id, createdAt, updateAt) VALUES ('', '', '')";

    private static String updateSql = "UPDATE TABLE1 SET updateAt = '' where id = '1'";

    private static String deleteSql = "DELETE TABLE1 WHERE id = '1'";

    public static void main(String[] args) throws Exception {

        Statement statement = pm.parse(new StringReader(selectSql));
        if (statement instanceof Select) {
            Select select = (Select) statement;
            PlainSelect selectBody = (PlainSelect) select.getSelectBody();
            List<SelectItem> selectItems = selectBody.getSelectItems();
            Expression whereExpression = selectBody.getWhere();

            System.out.println("where expression==>>" + whereExpression);
            System.out.println("----------------------------------------------");
            for (SelectItem selectItem : selectItems) {
                selectItem.accept(new SelectItemVisitorAdapter() {
                    @Override
                    public void visit(SelectExpressionItem selectExpressionItem) {
                        System.out.println(selectExpressionItem.getExpression());
                        Alias alias = selectExpressionItem.getAlias();
                        System.out.println(alias == null ? "-----------------------------------------------no alias" : alias.getName());
                        System.out.println();
                    }
                });
            }
        }
    }

    static class MySelectVisitor extends SelectVisitorAdapter {
        @Override
        public void visit(PlainSelect plainSelect) {

        }

        @Override
        public void visit(SetOperationList setOperationList) {

        }

        @Override
        public void visit(WithItem withItem) {

        }

        @Override
        public void visit(ValuesStatement valuesStatement) {

        }
    }

    static class MyFromItemVisitor extends FromItemVisitorAdapter {
        @Override
        public void visit(Table table) {

        }

        @Override
        public void visit(SubSelect subSelect) {

        }

        @Override
        public void visit(SubJoin subJoin) {

        }

        @Override
        public void visit(LateralSubSelect lateralSubSelect) {

        }

        @Override
        public void visit(ValuesList valuesList) {

        }

        @Override
        public void visit(TableFunction tableFunction) {

        }

        @Override
        public void visit(ParenthesisFromItem parenthesisFromItem) {

        }
    }

    static class MyJoinVisitor extends ExpressionVisitorAdapter {

        @Override
        public void visit(BitwiseRightShift bitwiseRightShift) {

        }

        @Override
        public void visit(BitwiseLeftShift bitwiseLeftShift) {

        }

        @Override
        public void visit(NullValue nullValue) {

        }

        @Override
        public void visit(Function function) {

        }

        @Override
        public void visit(SignedExpression signedExpression) {

        }

        @Override
        public void visit(JdbcParameter jdbcParameter) {

        }

        @Override
        public void visit(JdbcNamedParameter jdbcNamedParameter) {

        }

        @Override
        public void visit(DoubleValue doubleValue) {

        }

        @Override
        public void visit(LongValue longValue) {

        }

        @Override
        public void visit(HexValue hexValue) {

        }

        @Override
        public void visit(DateValue dateValue) {

        }

        @Override
        public void visit(TimeValue timeValue) {

        }

        @Override
        public void visit(TimestampValue timestampValue) {

        }

        @Override
        public void visit(Parenthesis parenthesis) {

        }

        @Override
        public void visit(StringValue stringValue) {

        }

        @Override
        public void visit(Addition addition) {

        }

        @Override
        public void visit(Division division) {

        }

        @Override
        public void visit(Multiplication multiplication) {

        }

        @Override
        public void visit(Subtraction subtraction) {

        }

        @Override
        public void visit(AndExpression andExpression) {

        }

        @Override
        public void visit(OrExpression orExpression) {

        }

        @Override
        public void visit(Between between) {

        }

        @Override
        public void visit(EqualsTo equalsTo) {

        }

        @Override
        public void visit(GreaterThan greaterThan) {

        }

        @Override
        public void visit(GreaterThanEquals greaterThanEquals) {

        }

        @Override
        public void visit(InExpression inExpression) {

        }

        @Override
        public void visit(IsNullExpression isNullExpression) {

        }

        @Override
        public void visit(LikeExpression likeExpression) {

        }

        @Override
        public void visit(MinorThan minorThan) {

        }

        @Override
        public void visit(MinorThanEquals minorThanEquals) {

        }

        @Override
        public void visit(NotEqualsTo notEqualsTo) {

        }

        @Override
        public void visit(Column column) {

        }

        @Override
        public void visit(SubSelect subSelect) {

        }

        @Override
        public void visit(CaseExpression caseExpression) {

        }

        @Override
        public void visit(WhenClause whenClause) {

        }

        @Override
        public void visit(ExistsExpression existsExpression) {

        }

        @Override
        public void visit(AllComparisonExpression allComparisonExpression) {

        }

        @Override
        public void visit(AnyComparisonExpression anyComparisonExpression) {

        }

        @Override
        public void visit(Concat concat) {

        }

        @Override
        public void visit(Matches matches) {

        }

        @Override
        public void visit(BitwiseAnd bitwiseAnd) {

        }

        @Override
        public void visit(BitwiseOr bitwiseOr) {

        }

        @Override
        public void visit(BitwiseXor bitwiseXor) {

        }

        @Override
        public void visit(CastExpression castExpression) {

        }

        @Override
        public void visit(Modulo modulo) {

        }

        @Override
        public void visit(AnalyticExpression analyticExpression) {

        }

        @Override
        public void visit(ExtractExpression extractExpression) {

        }

        @Override
        public void visit(IntervalExpression intervalExpression) {

        }

        @Override
        public void visit(OracleHierarchicalExpression oracleHierarchicalExpression) {

        }

        @Override
        public void visit(RegExpMatchOperator regExpMatchOperator) {

        }

        @Override
        public void visit(JsonExpression jsonExpression) {

        }

        @Override
        public void visit(JsonOperator jsonOperator) {

        }

        @Override
        public void visit(RegExpMySQLOperator regExpMySQLOperator) {

        }

        @Override
        public void visit(UserVariable userVariable) {

        }

        @Override
        public void visit(NumericBind numericBind) {

        }

        @Override
        public void visit(KeepExpression keepExpression) {

        }

        @Override
        public void visit(MySQLGroupConcat mySQLGroupConcat) {

        }

        @Override
        public void visit(ValueListExpression valueListExpression) {

        }

        @Override
        public void visit(RowConstructor rowConstructor) {

        }

        @Override
        public void visit(OracleHint oracleHint) {

        }

        @Override
        public void visit(TimeKeyExpression timeKeyExpression) {

        }

        @Override
        public void visit(DateTimeLiteralExpression dateTimeLiteralExpression) {

        }

        @Override
        public void visit(NotExpression notExpression) {

        }
    }

    static class MyItemsListVisitor extends ItemsListVisitorAdapter {
        @Override
        public void visit(SubSelect subSelect) {

        }

        @Override
        public void visit(ExpressionList expressionList) {

        }

        @Override
        public void visit(NamedExpressionList namedExpressionList) {

        }

        @Override
        public void visit(MultiExpressionList multiExpressionList) {

        }
    }

    static class MySelectItemVisitor extends SelectItemVisitorAdapter {

        @Override
        public void visit(AllColumns allColumns) {

        }

        @Override
        public void visit(AllTableColumns allTableColumns) {

        }

        @Override
        public void visit(SelectExpressionItem selectExpressionItem) {

        }
    }

    static class MyExpressionVisitor implements ExpressionVisitor {

        @Override
        public void visit(BitwiseRightShift bitwiseRightShift) {

        }

        @Override
        public void visit(BitwiseLeftShift bitwiseLeftShift) {

        }

        @Override
        public void visit(NullValue nullValue) {

        }

        @Override
        public void visit(Function function) {

        }

        @Override
        public void visit(SignedExpression signedExpression) {

        }

        @Override
        public void visit(JdbcParameter jdbcParameter) {

        }

        @Override
        public void visit(JdbcNamedParameter jdbcNamedParameter) {

        }

        @Override
        public void visit(DoubleValue doubleValue) {

        }

        @Override
        public void visit(LongValue longValue) {

        }

        @Override
        public void visit(HexValue hexValue) {

        }

        @Override
        public void visit(DateValue dateValue) {

        }

        @Override
        public void visit(TimeValue timeValue) {

        }

        @Override
        public void visit(TimestampValue timestampValue) {

        }

        @Override
        public void visit(Parenthesis parenthesis) {

        }

        @Override
        public void visit(StringValue stringValue) {

        }

        @Override
        public void visit(Addition addition) {

        }

        @Override
        public void visit(Division division) {

        }

        @Override
        public void visit(Multiplication multiplication) {

        }

        @Override
        public void visit(Subtraction subtraction) {

        }

        @Override
        public void visit(AndExpression andExpression) {

        }

        @Override
        public void visit(OrExpression orExpression) {

        }

        @Override
        public void visit(Between between) {

        }

        @Override
        public void visit(EqualsTo equalsTo) {

        }

        @Override
        public void visit(GreaterThan greaterThan) {

        }

        @Override
        public void visit(GreaterThanEquals greaterThanEquals) {

        }

        @Override
        public void visit(InExpression inExpression) {

        }

        @Override
        public void visit(IsNullExpression isNullExpression) {

        }

        @Override
        public void visit(LikeExpression likeExpression) {

        }

        @Override
        public void visit(MinorThan minorThan) {

        }

        @Override
        public void visit(MinorThanEquals minorThanEquals) {

        }

        @Override
        public void visit(NotEqualsTo notEqualsTo) {

        }

        @Override
        public void visit(Column column) {

        }

        @Override
        public void visit(SubSelect subSelect) {

        }

        @Override
        public void visit(CaseExpression caseExpression) {

        }

        @Override
        public void visit(WhenClause whenClause) {

        }

        @Override
        public void visit(ExistsExpression existsExpression) {

        }

        @Override
        public void visit(AllComparisonExpression allComparisonExpression) {

        }

        @Override
        public void visit(AnyComparisonExpression anyComparisonExpression) {

        }

        @Override
        public void visit(Concat concat) {

        }

        @Override
        public void visit(Matches matches) {

        }

        @Override
        public void visit(BitwiseAnd bitwiseAnd) {

        }

        @Override
        public void visit(BitwiseOr bitwiseOr) {

        }

        @Override
        public void visit(BitwiseXor bitwiseXor) {

        }

        @Override
        public void visit(CastExpression castExpression) {

        }

        @Override
        public void visit(Modulo modulo) {

        }

        @Override
        public void visit(AnalyticExpression analyticExpression) {

        }

        @Override
        public void visit(ExtractExpression extractExpression) {

        }

        @Override
        public void visit(IntervalExpression intervalExpression) {

        }

        @Override
        public void visit(OracleHierarchicalExpression oracleHierarchicalExpression) {

        }

        @Override
        public void visit(RegExpMatchOperator regExpMatchOperator) {

        }

        @Override
        public void visit(JsonExpression jsonExpression) {

        }

        @Override
        public void visit(JsonOperator jsonOperator) {

        }

        @Override
        public void visit(RegExpMySQLOperator regExpMySQLOperator) {

        }

        @Override
        public void visit(UserVariable userVariable) {

        }

        @Override
        public void visit(NumericBind numericBind) {

        }

        @Override
        public void visit(KeepExpression keepExpression) {

        }

        @Override
        public void visit(MySQLGroupConcat mySQLGroupConcat) {

        }

        @Override
        public void visit(ValueListExpression valueListExpression) {

        }

        @Override
        public void visit(RowConstructor rowConstructor) {

        }

        @Override
        public void visit(OracleHint oracleHint) {

        }

        @Override
        public void visit(TimeKeyExpression timeKeyExpression) {

        }

        @Override
        public void visit(DateTimeLiteralExpression dateTimeLiteralExpression) {

        }

        @Override
        public void visit(NotExpression notExpression) {

        }
    }

    static class MyStatementVisitor extends StatementVisitorAdapter {

        @Override
        public void visit(Select select) {
            System.out.println("visit select");
        }

        @Override
        public void visit(Delete delete) {
            System.out.println("visit delete");
        }

        @Override
        public void visit(Update update) {
            System.out.println("visit update");
        }

        @Override
        public void visit(Insert insert) {
            System.out.println("visit insert");
        }
    }

}

// Generated from C:/Workspaces/IntelliJ_Workspace/MiniGoSemantics/src/main/antlr4/de/wernet/minigosemantics/antlr\MiniGo.g4 by ANTLR 4.5.3
package de.wernet.minigosemantics.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniGoLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		WS=25, DIGIT=26, LETTER=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "WS", "DIGIT", 
		"LETTER"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "';'", "'go'", "'<-'", "':='", "'newChannel'", "'='", 
		"'while'", "'if'", "'else'", "'print'", "'&&'", "'=='", "'>'", "'+'", 
		"'-'", "'*'", "'/'", "'!'", "'('", "')'", "'true'", "'false'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WS", "DIGIT", "LETTER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public MiniGoLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniGo.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\35\u0095\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\6\32\u008c\n\32"+
		"\r\32\16\32\u008d\3\32\3\32\3\33\3\33\3\34\3\34\2\2\35\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\5\5\2\13\f\17\17\"\""+
		"\3\2\62;\3\2c|\u0095\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13B\3\2\2\2\rE\3\2\2"+
		"\2\17H\3\2\2\2\21S\3\2\2\2\23U\3\2\2\2\25[\3\2\2\2\27^\3\2\2\2\31c\3\2"+
		"\2\2\33i\3\2\2\2\35l\3\2\2\2\37o\3\2\2\2!q\3\2\2\2#s\3\2\2\2%u\3\2\2\2"+
		"\'w\3\2\2\2)y\3\2\2\2+{\3\2\2\2-}\3\2\2\2/\177\3\2\2\2\61\u0084\3\2\2"+
		"\2\63\u008b\3\2\2\2\65\u0091\3\2\2\2\67\u0093\3\2\2\29:\7}\2\2:\4\3\2"+
		"\2\2;<\7\177\2\2<\6\3\2\2\2=>\7=\2\2>\b\3\2\2\2?@\7i\2\2@A\7q\2\2A\n\3"+
		"\2\2\2BC\7>\2\2CD\7/\2\2D\f\3\2\2\2EF\7<\2\2FG\7?\2\2G\16\3\2\2\2HI\7"+
		"p\2\2IJ\7g\2\2JK\7y\2\2KL\7E\2\2LM\7j\2\2MN\7c\2\2NO\7p\2\2OP\7p\2\2P"+
		"Q\7g\2\2QR\7n\2\2R\20\3\2\2\2ST\7?\2\2T\22\3\2\2\2UV\7y\2\2VW\7j\2\2W"+
		"X\7k\2\2XY\7n\2\2YZ\7g\2\2Z\24\3\2\2\2[\\\7k\2\2\\]\7h\2\2]\26\3\2\2\2"+
		"^_\7g\2\2_`\7n\2\2`a\7u\2\2ab\7g\2\2b\30\3\2\2\2cd\7r\2\2de\7t\2\2ef\7"+
		"k\2\2fg\7p\2\2gh\7v\2\2h\32\3\2\2\2ij\7(\2\2jk\7(\2\2k\34\3\2\2\2lm\7"+
		"?\2\2mn\7?\2\2n\36\3\2\2\2op\7@\2\2p \3\2\2\2qr\7-\2\2r\"\3\2\2\2st\7"+
		"/\2\2t$\3\2\2\2uv\7,\2\2v&\3\2\2\2wx\7\61\2\2x(\3\2\2\2yz\7#\2\2z*\3\2"+
		"\2\2{|\7*\2\2|,\3\2\2\2}~\7+\2\2~.\3\2\2\2\177\u0080\7v\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7w\2\2\u0082\u0083\7g\2\2\u0083\60\3\2\2\2\u0084\u0085"+
		"\7h\2\2\u0085\u0086\7c\2\2\u0086\u0087\7n\2\2\u0087\u0088\7u\2\2\u0088"+
		"\u0089\7g\2\2\u0089\62\3\2\2\2\u008a\u008c\t\2\2\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\b\32\2\2\u0090\64\3\2\2\2\u0091\u0092\t\3\2\2\u0092"+
		"\66\3\2\2\2\u0093\u0094\t\4\2\2\u00948\3\2\2\2\4\2\u008d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
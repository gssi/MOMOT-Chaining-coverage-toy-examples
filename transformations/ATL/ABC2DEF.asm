<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="ABC2DEF"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchRoot():V"/>
		<constant value="A.__matchA2D():V"/>
		<constant value="A.__matchB2E():V"/>
		<constant value="A.__matchC2F():V"/>
		<constant value="__exec__"/>
		<constant value="Root"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyRoot(NTransientLink;):V"/>
		<constant value="A2D"/>
		<constant value="A.__applyA2D(NTransientLink;):V"/>
		<constant value="B2E"/>
		<constant value="A.__applyB2E(NTransientLink;):V"/>
		<constant value="C2F"/>
		<constant value="A.__applyC2F(NTransientLink;):V"/>
		<constant value="__matchRoot"/>
		<constant value="ABC"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="s"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="t"/>
		<constant value="DEF"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="6:5-10:3"/>
		<constant value="__applyRoot"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="as"/>
		<constant value="ds"/>
		<constant value="bs"/>
		<constant value="es"/>
		<constant value="cs"/>
		<constant value="fs"/>
		<constant value="7:8-7:9"/>
		<constant value="7:8-7:12"/>
		<constant value="7:2-7:12"/>
		<constant value="8:8-8:9"/>
		<constant value="8:8-8:12"/>
		<constant value="8:2-8:12"/>
		<constant value="9:8-9:9"/>
		<constant value="9:8-9:12"/>
		<constant value="9:2-9:12"/>
		<constant value="link"/>
		<constant value="__matchA2D"/>
		<constant value="D"/>
		<constant value="14:5-16:3"/>
		<constant value="__applyA2D"/>
		<constant value="element created from "/>
		<constant value="a"/>
		<constant value="J.+(J):J"/>
		<constant value="d"/>
		<constant value="15:7-15:30"/>
		<constant value="15:32-15:33"/>
		<constant value="15:32-15:35"/>
		<constant value="15:7-15:35"/>
		<constant value="15:2-15:35"/>
		<constant value="__matchB2E"/>
		<constant value="B"/>
		<constant value="E"/>
		<constant value="21:5-23:3"/>
		<constant value="__applyB2E"/>
		<constant value="b"/>
		<constant value="22:7-22:30"/>
		<constant value="22:31-22:32"/>
		<constant value="22:31-22:34"/>
		<constant value="22:7-22:34"/>
		<constant value="22:2-22:34"/>
		<constant value="__matchC2F"/>
		<constant value="C"/>
		<constant value="F"/>
		<constant value="28:5-30:3"/>
		<constant value="__applyC2F"/>
		<constant value="c"/>
		<constant value="f"/>
		<constant value="29:7-29:30"/>
		<constant value="29:33-29:34"/>
		<constant value="29:33-29:36"/>
		<constant value="29:7-29:36"/>
		<constant value="29:2-29:36"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="45"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="45"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="66" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="67">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="72"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="76"/>
			<call arg="30"/>
			<set arg="77"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="78" begin="11" end="11"/>
			<lne id="79" begin="11" end="12"/>
			<lne id="80" begin="9" end="14"/>
			<lne id="81" begin="17" end="17"/>
			<lne id="82" begin="17" end="18"/>
			<lne id="83" begin="15" end="20"/>
			<lne id="84" begin="23" end="23"/>
			<lne id="85" begin="23" end="24"/>
			<lne id="86" begin="21" end="26"/>
			<lne id="66" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="27"/>
			<lve slot="2" name="60" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="87" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="88">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="6"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="89"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="90" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="91">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<push arg="92"/>
			<load arg="29"/>
			<get arg="93"/>
			<call arg="94"/>
			<call arg="30"/>
			<set arg="95"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="96" begin="11" end="11"/>
			<lne id="97" begin="12" end="12"/>
			<lne id="98" begin="12" end="13"/>
			<lne id="99" begin="11" end="14"/>
			<lne id="100" begin="9" end="16"/>
			<lne id="90" begin="8" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="17"/>
			<lve slot="2" name="60" begin="3" end="17"/>
			<lve slot="0" name="17" begin="0" end="17"/>
			<lve slot="1" name="87" begin="0" end="17"/>
		</localvariabletable>
	</operation>
	<operation name="101">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="102"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="103"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="104" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<push arg="92"/>
			<load arg="29"/>
			<get arg="106"/>
			<call arg="94"/>
			<call arg="30"/>
			<set arg="33"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="107" begin="11" end="11"/>
			<lne id="108" begin="12" end="12"/>
			<lne id="109" begin="12" end="13"/>
			<lne id="110" begin="11" end="14"/>
			<lne id="111" begin="9" end="16"/>
			<lne id="104" begin="8" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="17"/>
			<lve slot="2" name="60" begin="3" end="17"/>
			<lve slot="0" name="17" begin="0" end="17"/>
			<lve slot="1" name="87" begin="0" end="17"/>
		</localvariabletable>
	</operation>
	<operation name="112">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="113"/>
			<push arg="55"/>
			<findme/>
			<push arg="56"/>
			<call arg="57"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="58"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="59"/>
			<dup/>
			<push arg="60"/>
			<load arg="19"/>
			<pcall arg="61"/>
			<dup/>
			<push arg="62"/>
			<push arg="114"/>
			<push arg="63"/>
			<new/>
			<pcall arg="64"/>
			<pusht/>
			<pcall arg="65"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="115" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="60" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="68"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="60"/>
			<call arg="69"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="62"/>
			<call arg="70"/>
			<store arg="71"/>
			<load arg="71"/>
			<dup/>
			<getasm/>
			<push arg="92"/>
			<load arg="29"/>
			<get arg="117"/>
			<call arg="94"/>
			<call arg="30"/>
			<set arg="118"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="119" begin="11" end="11"/>
			<lne id="120" begin="12" end="12"/>
			<lne id="121" begin="12" end="13"/>
			<lne id="122" begin="11" end="14"/>
			<lne id="123" begin="9" end="16"/>
			<lne id="115" begin="8" end="17"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="62" begin="7" end="17"/>
			<lve slot="2" name="60" begin="3" end="17"/>
			<lve slot="0" name="17" begin="0" end="17"/>
			<lve slot="1" name="87" begin="0" end="17"/>
		</localvariabletable>
	</operation>
</asm>

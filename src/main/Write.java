package main;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Write {

	public static void main(String[] args) {
		try {
			PrintWriter writer = new PrintWriter("name.csv");
			StringBuilder sb = new StringBuilder();
			sb.append("id,name\n");
			String[] name = new String[] {"傲天神域", "梦幻灬星晨", "光之雷神", "独霸天下", "翼羽覆下", "风火男爵", "冷少庭", "暗夜霸主", "蕴魂刹罗", "弒血", 
					"纵横乾坤", "乱世、傲骨", "狼心血义", "高傲一个谣", "冥狱修罗", "灭世丶征服", "輓風囨畱", "斩空沧影", "乱剑摩天", "狂的像阵风",
					"能打又会撩", "有志气带脾气", "爺丶蕝版莮陔", "弑神魔帝", "鹤啸九天", "龙战ゞ天下", "不灭雷神", "纵横一世", "傲世轩血", "毒霸天下", 
					"邪恶少年", "火龙之影", "为你、战天下", "冷月灵魂", "学神叼炸天", "打小就酷", "刀光贱影", "兮风殇影", "高傲男神", "风一样的男子",
					"嗜血丶狂杀", "嗜影狂魔", "千影鬼刹", "逆霸震天", "王霸灬之气", "东狱邪神", "绝世骚神", "地狱之歌", "老子来虐菜", "傲绝灭天", 
					"鬼冥亡灵", "乱世天下", "时间盗走狗", "狂拽龙少", "不败神话少爷", "死亡复笙", "坐在坟前可劲闹", "破天战魂", "獨尊、寵妃", "风莫羽",
					"神战天下", "霸星天逆", "餤紫銫", "潮流风范", "为迩独战天下", "战天弑神", "独傲风云", "怒狙之神", "离影", "灭绝苍生", 
					"龙腾神话", "打小是祖宗", "冷酷至尊", "魔帝殤邪", "来世路兄弟陪", "咕蔱狂魔", "冷酷的云", "战天弑魔", "洛冥炫", "傲战八方",
					"比牛比还牛比", "盖世仙女", "战逆天", "绝杀苍雷", "冷面郎君", "残殇", "祁苍邪", "乱世重生", "殇之荣耀", "伤城离歌",
					"无泣之魂", "帝王傲世", "血战狂龙", "嗜月", "冷酷的男子", "斩风御影", "血屠杀手", "梦战苍穹", "裂风狂龙", "疯狂魔龙",
					"灭神轰仙", "恋之狂战", "逍遥战狂", "独霸天下"};
			int idx = 0;
			for (String element : name) {
				sb.append(idx++ + "," + element + "\n");
			}
			writer.write(sb.toString());
			writer.close();
			System.out.println("done!");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}

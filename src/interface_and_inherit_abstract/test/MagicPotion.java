package interface_and_inherit_abstract.test;

public class MagicPotion extends Item {

    public void effect(){
        System.out.println("��ƿʹ�ú󣬿��Ի�ħ��");
    }
	
	@Override
	public boolean disposable() {

		return true;
	}

}

DESCRIPTION = "Imagem console a ser usada no equipamento Equalizer, \
da CM Comandos Lineares"
 
# Customizacao dos recursos da imagem: essencialmente 1) gerenciamento de pacotes;
# 2) acesso externo via SSH e 3) ferramentas de desenvolvimento e debug
IMAGE_FEATURES += "package-management \
    ssh-server-openssh \
    debug-tweaks \
    "

# Inclusao dos pacotes presentes na imagem. Deve ser preparada uma imagem simples
# contendo as funcionalidades de console do Linux, juntamente com os modulos de
# kernel definidos para a maquina. Um packagegroups especifico para o software do
# equipamento foi criado contendo os recursos necessarios para funcionamento da
# solucao
IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-equalizer \
    kernel-modules \
    linux-firmware \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    "

IMAGE_INSTALL_append += "servermodbus"

inherit core-image  
  
# Adicionando espaco extra na imagem Linux gerada
IMAGE_ROOTFS_EXTRA_SPACE_append += "+ 3000000"

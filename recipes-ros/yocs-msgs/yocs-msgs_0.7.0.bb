DESCRIPTION = "Yujin's Open Control System messages, services and actions"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs std-msgs std-srvs geometry-msgs message-generation dynamic-reconfigure"

SRC_URI = "https://github.com/yujinrobot-release/yocs_msgs-release/archive/release/melodic/${ROS_SPN}/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ffb77e4ff25ced4c932217309eff52aa"
SRC_URI[sha256sum] = "ff421bef61ecb9d4d2987f8330ae1a2e1d284fa8cfd9727364eaca31594a60ce"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin

DESCRIPTION = "The md49_messages package"
AUTHOR = "Fabian Prinzing"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation std-msgs message-runtime std-msgs"

RDEPENDS_${PN} = "message-runtime std-msgs"

SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/melodic/md49_messages/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "2646be98f683bea6c26cd5d50186b0d4"
SRC_URI[sha256sum] = "490add7ab7660314b642b0fc9275ef33506a09326194e3d91b21f1229f86d17c"

ROS_SPN = "md49_base_controller"
S = "${WORKDIR}/md49_base_controller-release-release-melodic-md49_messages-0.1.4-1"

inherit catkin

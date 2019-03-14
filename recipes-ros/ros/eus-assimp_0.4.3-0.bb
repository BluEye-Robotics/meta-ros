DESCRIPTION = "eus_assimp"
AUTHOR = "Yohei Kakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "euslisp assimp-devel pkgconfig roseus assimp-devel"

RDEPENDS_${PN} = "roseus assimp-devel"

SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/melodic/eus_assimp/0.4.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f3a6101cc22cdbdfdc4260ad792d85d5"
SRC_URI[sha256sum] = "c82e9cbb4c4fd87a20d1c6a596293aed0dbc8661a1ccb4f57f4637cc688b8548"

ROS_SPN = "jsk_model_tools"
S = "${WORKDIR}/jsk_model_tools-release-release-melodic-eus_assimp-0.4.3-0"

inherit catkin

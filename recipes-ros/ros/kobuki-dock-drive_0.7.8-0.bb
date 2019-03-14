DESCRIPTION = "	 Dock driving library for Kobuki. Users owning a docking station for Kobuki 	 can use this tool to develop autonomous docking drive algorithms."
AUTHOR = "Younghun Ju"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-threads ecl-geometry ecl-linear-algebra ecl-threads ecl-geometry ecl-linear-algebra"

RDEPENDS_${PN} = "ecl-threads ecl-geometry ecl-linear-algebra"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_dock_drive/0.7.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1809b105bd16c6b7574b8b3958da6e9b"
SRC_URI[sha256sum] = "4dfca7766cb632cb77dd853c714c4da273b373cb549f891a71533fd0ea36d437"

ROS_SPN = "kobuki_core"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_dock_drive-0.7.8-0"

inherit catkin

DESCRIPTION = "Embeds the TCLAP library inside the ecl. This is a very convenient command line parser in templatised c++."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-license"

RDEPENDS_${PN} = "ecl-license"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_command_line/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ef97b959295b337f712ebb60d30b255c"
SRC_URI[sha256sum] = "db3031f9d20cc04364f267a0cc028ea9b86730a1679d5ff6fc7023409ebde7b7"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_command_line-0.62.2-0"

inherit catkin

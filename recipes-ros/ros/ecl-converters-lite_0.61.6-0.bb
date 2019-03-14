DESCRIPTION = "These are a very simple version of some of the functions in ecl_converters suitable for firmware development. That is, there is no use of new, templates or exceptions."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-license ecl-config"

RDEPENDS_${PN} = "ecl-license ecl-config"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_converters_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b414375054fb710c758d0d2db2a39ad4"
SRC_URI[sha256sum] = "ebd1d37b95bab3798917d592fa2fe83236f1b6a530ce43d1bf823b8730320368"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_converters_lite-0.61.6-0"

inherit catkin

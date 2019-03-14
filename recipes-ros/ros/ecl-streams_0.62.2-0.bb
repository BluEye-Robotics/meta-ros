DESCRIPTION = "These are lightweight text streaming classes that connect to standardised ecl type devices."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-errors ecl-concepts ecl-devices ecl-time ecl-converters ecl-type-traits ecl-license ecl-errors ecl-concepts ecl-devices ecl-time ecl-converters ecl-type-traits"

RDEPENDS_${PN} = "ecl-license ecl-errors ecl-concepts ecl-devices ecl-time ecl-converters ecl-type-traits"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_streams/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b9bebbd8d61282c450b9df0e958efd99"
SRC_URI[sha256sum] = "0fd7c5407bc67d28e90e8bb3cee3850ab90ee195b74703949c991cfc0a5836c3"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_streams-0.62.2-0"

inherit catkin

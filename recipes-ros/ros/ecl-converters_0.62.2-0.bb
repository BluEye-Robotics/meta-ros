DESCRIPTION = "Some fast/convenient type converters, mostly for char strings or strings. These are not really fully fleshed out, alot of them could use the addition for the whole range of fundamental types (e. g. all integers, not just int, unsigned int). They will come as the need arises."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-config ecl-errors ecl-exceptions ecl-mpl ecl-type-traits ecl-concepts ecl-license ecl-config ecl-errors ecl-exceptions ecl-mpl ecl-type-traits ecl-concepts"

RDEPENDS_${PN} = "ecl-license ecl-config ecl-errors ecl-exceptions ecl-mpl ecl-type-traits ecl-concepts"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/melodic/ecl_converters/0.62.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "1bdb582fb1b0f58a113ca73c835093f3"
SRC_URI[sha256sum] = "30286767e22011751173f3a7c3d063f26f675e6340cd56765e90853879058909"

ROS_SPN = "ecl_core"
S = "${WORKDIR}/ecl_core-release-release-melodic-ecl_converters-0.62.2-0"

inherit catkin

DESCRIPTION = "Provides a portable set of time functions that are especially useful for porting other code or being wrapped by higher level c++ classes."
AUTHOR = "Daniel Stonier"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-license ecl-build ecl-config ecl-errors ecl-license ecl-build ecl-config ecl-errors"

RDEPENDS_${PN} = "ecl-license ecl-build ecl-config ecl-errors"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_time_lite/0.61.6-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "fee500b9bb2efe816b176232dcac1944"
SRC_URI[sha256sum] = "97485e9c7be495031bb6c5b207851c5e8458bb243cb2f4e5dcfa9c2dcc854050"

ROS_SPN = "ecl_lite"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_time_lite-0.61.6-0"

inherit catkin

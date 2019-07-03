DESCRIPTION = "Miscellaneous tools for pyROS"
AUTHOR = "AlexV"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-pip roslint rospy rosgraph roslaunch rostest"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/pyros-dev/pyros-utils-release/archive/release/melodic/pyros_utils/0.1.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "c42bc20ecf73eeda88839eaface4ddb5"
SRC_URI[sha256sum] = "a8d91138eef528f426627138f6b29c409bf7638a66c0939d9a0e4ad0c8e94900"

S = "${WORKDIR}/pyros-utils-release-release-melodic-pyros_utils-0.1.4-1"

inherit catkin

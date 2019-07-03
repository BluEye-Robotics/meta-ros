DESCRIPTION = "URDF description, Gazebo simulation, navigation, bringup launch files, message and action descriptions for the MiR100 robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mir-actions mir-description mir-driver mir-dwb-critics mir-gazebo mir-msgs mir-navigation"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_robot/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0e46097fc767941d941b3c133c0ae721"
SRC_URI[sha256sum] = "1be447be46d3485524682a594f9f55d972b07c44b4e29e31c2c57105530be475"

S = "${WORKDIR}/mir_robot-release-release-melodic-mir_robot-1.0.4-1"

inherit catkin

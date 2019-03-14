DESCRIPTION = "URDF description, Gazebo simulation, navigation, bringup launch files, message and action descriptions for the MiR100 robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "mir-actions mir-description mir-driver mir-dwb-critics mir-gazebo mir-msgs mir-navigation"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_robot/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "075a8a90ee2b7c8bb0a696fd95815143"
SRC_URI[sha256sum] = "3037700c38b063bebea35ba8506ede308e9115ac5487946af9c30b604e23b1db"

S = "${WORKDIR}/mir_robot-release-release-melodic-mir_robot-1.0.3-0"

inherit catkin

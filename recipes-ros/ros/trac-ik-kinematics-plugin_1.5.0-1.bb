DESCRIPTION = "A MoveIt! Kinematics plugin using TRAC-IK"
AUTHOR = "Patrick Beeson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "moveit-core pluginlib roscpp tf-conversions trac-ik-lib moveit-core pluginlib roscpp tf-conversions trac-ik-lib"

RDEPENDS_${PN} = "moveit-core pluginlib roscpp tf-conversions trac-ik-lib"

SRC_URI = "https://github.com/traclabs/trac_ik-release/archive/release/melodic/trac_ik_kinematics_plugin/1.5.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "41a11fb36ab66cd69eb1f47ff38738ce"
SRC_URI[sha256sum] = "9ac973d39470f1f0648e6e01cdd11b7207d61f3482bf7a4c302e43b7ae53896f"

ROS_SPN = "trac_ik"
S = "${WORKDIR}/trac_ik-release-release-melodic-trac_ik_kinematics_plugin-1.5.0-1"

inherit catkin

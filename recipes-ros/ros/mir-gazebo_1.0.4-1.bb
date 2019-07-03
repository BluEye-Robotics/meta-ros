DESCRIPTION = "Simulation specific launch and configuration files for the MiR100 robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "controller-manager fake-localization gazebo-ros joint-state-publisher mir-description mir-driver robot-localization robot-state-publisher rostopic rqt-robot-steering topic-tools"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_gazebo/1.0.4-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8ae522d7cf00446dfd94275df4e7f5a7"
SRC_URI[sha256sum] = "433d7b8eb2aa43766ee2147af39d967f7a7ef8df494fbde42eb423af0b3a4fdd"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_gazebo-1.0.4-1"

inherit catkin

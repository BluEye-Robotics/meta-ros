DESCRIPTION = "Simulation specific launch and configuration files for the MiR100 robot."
AUTHOR = "Martin Günther"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roslaunch"

RDEPENDS_${PN} = "controller-manager fake-localization gazebo-ros joint-state-publisher mir-description mir-driver robot-localization robot-state-publisher rostopic rqt-robot-steering topic-tools"

SRC_URI = "https://github.com/uos-gbp/mir_robot-release/archive/release/melodic/mir_gazebo/1.0.3-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9f0a3ed440d606934500369cf6640bb7"
SRC_URI[sha256sum] = "3e9fbfe4a30892fbde3192719aae286acba1c2f88b5238f5c72987e706d60c20"

ROS_SPN = "mir_robot"
S = "${WORKDIR}/mir_robot-release-release-melodic-mir_gazebo-1.0.3-0"

inherit catkin

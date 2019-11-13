DESCRIPTION = "Navigation related tutorials."
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "laser-scan-publisher-tutorial navigation-stage odometry-publisher-tutorial point-cloud-publisher-tutorial robot-setup-tf-tutorial roomba-stage simple-navigation-goals-tutorial"

RDEPENDS_${PN} = "laser-scan-publisher-tutorial navigation-stage odometry-publisher-tutorial point-cloud-publisher-tutorial robot-setup-tf-tutorial roomba-stage simple-navigation-goals-tutorial"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/navigation_tutorials/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ba94a037630cc59477cdb105af33eec8"
SRC_URI[sha256sum] = "0dc79f75fcfaff0dd5de61b32502b6e657d2e5d2994252bd974989e8a1848793"

S = "${WORKDIR}/navigation_tutorials-release-release-melodic-navigation_tutorials-0.2.3-1"

inherit catkin

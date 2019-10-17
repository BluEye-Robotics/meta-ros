DESCRIPTION = "Track the output of the leg_detector to indicate the velocity of person."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "easy-markers geometry-msgs kalman-filter people-msgs roslib rospy"

RDEPENDS_${PN} = "leg-detector"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_velocity_tracker/1.2.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "361fa9001e0997d785e1d89510cdc4a0"
SRC_URI[sha256sum] = "8058c2f01c299a3204c1ca5e6dc6e16e37afc35d10ae63d644ea0f21741c9ac8"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_velocity_tracker-1.2.0-1"

inherit catkin

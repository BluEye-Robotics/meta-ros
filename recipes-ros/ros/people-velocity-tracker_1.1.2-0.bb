DESCRIPTION = "Track the output of the leg_detector to indicate the velocity of person."
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "easy-markers geometry-msgs kalman-filter people-msgs roslib rospy"

RDEPENDS_${PN} = "leg-detector"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_velocity_tracker/1.1.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "340aa4d884c4ddc33787d1943239687d"
SRC_URI[sha256sum] = "57da6c218e5e9b052299795c8143a4efae4123d78dedb160a66ffa59251bc93c"

ROS_SPN = "people"
S = "${WORKDIR}/people-release-release-melodic-people_velocity_tracker-1.1.2-0"

inherit catkin

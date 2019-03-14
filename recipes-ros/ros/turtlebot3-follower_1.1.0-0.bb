DESCRIPTION = "The follower demo was implemented using a 360 Laser Distance Sensor LDS-01. The classification algorithm is used based on previous fitting with samples of person and obstacles positions to take actions. It follows someone in front of the robot within a 50 centimeter range and 140 degrees."
AUTHOR = "Gilbert"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "rospy std-msgs sensor-msgs geometry-msgs nav-msgs"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/turtlebot3_applications-release/archive/release/melodic/turtlebot3_follower/1.1.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0740a5820818f00077fbae1b0b3ba238"
SRC_URI[sha256sum] = "f2059a2728165ba5974739c04cabd2e782f3c06bff35299c149836c98bc6a429"

ROS_SPN = "turtlebot3_applications"
S = "${WORKDIR}/turtlebot3_applications-release-release-melodic-turtlebot3_follower-1.1.0-0"

inherit catkin

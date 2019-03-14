DESCRIPTION = "Filters a laser scan to remove points that are in the current static map"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy sensor-msgs nav-msgs tf std-msgs rospy sensor-msgs nav-msgs tf std-msgs roslib laser-filters"

RDEPENDS_${PN} = "rospy sensor-msgs nav-msgs tf std-msgs roslib laser-filters"

SRC_URI = "https://github.com/wu-robotics/laser_filtering_release/archive/release/melodic/map_laser/0.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f3c58db6e4d310723ebc3aac48511a14"
SRC_URI[sha256sum] = "eea82c4a217ce37a62d9e6dc06c0a309cbe738b5da63ea573aea59d8efa25d67"

ROS_SPN = "laser_filtering"
S = "${WORKDIR}/laser_filtering_release-release-melodic-map_laser-0.0.4-0"

inherit catkin

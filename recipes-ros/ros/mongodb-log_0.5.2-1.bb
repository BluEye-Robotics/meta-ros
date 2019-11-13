DESCRIPTION = "The mongodb_log package"
AUTHOR = "Tim Niemueller"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "rospy roslib rosgraph rostopic tf sensor-msgs openssl mongodb-store rospy roslib rosgraph rostopic tf sensor-msgs python-pymongo mongodb-store"

RDEPENDS_${PN} = "rospy roslib rosgraph rostopic tf sensor-msgs python-pymongo mongodb-store"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_log/0.5.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "40357543de694586976b1918e27c9f65"
SRC_URI[sha256sum] = "0482630592871557d4d9d9dff8bcd61a3c8801c840cc2477f51f4a3806a7453e"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_log-0.5.2-1"

inherit catkin

DESCRIPTION = "The mongodb_log package"
AUTHOR = "Tim Niemueller"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "rospy roslib rosgraph rostopic tf sensor-msgs openssl mongodb-store rospy roslib rosgraph rostopic tf sensor-msgs python-pymongo mongodb-store"

RDEPENDS_${PN} = "rospy roslib rosgraph rostopic tf sensor-msgs python-pymongo mongodb-store"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_log/0.5.0-5.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "61f1eaf88310b82cdb6a258d6fb1b0b2"
SRC_URI[sha256sum] = "5ce0f217758fb3d15c24d5e6a00c59116028201b7ae95e3b5fa91af0ed8d5f2d"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_log-0.5.0-5"

inherit catkin

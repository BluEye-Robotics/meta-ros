DESCRIPTION = "The mongodb_log package"
AUTHOR = "Tim Niemueller"
SECTION = "devel"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

DEPENDS = "rospy roslib rosgraph rostopic tf sensor-msgs openssl mongodb-store rospy roslib rosgraph rostopic tf sensor-msgs python3-pymongo mongodb-store"

RDEPENDS_${PN} = "rospy roslib rosgraph rostopic tf sensor-msgs python3-pymongo mongodb-store"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_log/0.5.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "353e1bdc73ce8b792b72282af865d290"
SRC_URI[sha256sum] = "dc56aae114fe58747eb278bc0a61859a81ebc01ff0c8c939464aaf0620732596"

ROS_SPN = "mongodb_store"
S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_log-0.5.1-2"

inherit catkin

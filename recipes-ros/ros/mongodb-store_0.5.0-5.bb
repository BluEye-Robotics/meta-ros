DESCRIPTION = "A package to support MongoDB-based storage and analysis for data from a ROS system, eg. saved messages, configurations etc"
AUTHOR = "Chris Burbridge"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy roscpp std-msgs std-srvs message-generation mongodb-store-msgs rostest python-catkin-pkg mongodb openssl topic-tools geometry-msgs rospy roscpp std-msgs std-srvs python-pymongo mongodb mongodb-store-msgs topic-tools geometry-msgs"

RDEPENDS_${PN} = "rospy roscpp std-msgs std-srvs python-pymongo mongodb mongodb-store-msgs topic-tools geometry-msgs"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store/0.5.0-5.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8e58bd4a50debf277651498cd7e2b8cf"
SRC_URI[sha256sum] = "6a139eb69db2efaa95e3b7a013a61624e082e580bdc4c8ba2f331ecda89a0b39"

S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_store-0.5.0-5"

inherit catkin

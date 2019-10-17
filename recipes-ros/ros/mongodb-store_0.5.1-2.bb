DESCRIPTION = "A package to support MongoDB-based storage and analysis for data from a ROS system, eg. saved messages, configurations etc"
AUTHOR = "Chris Burbridge"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "rospy roscpp std-msgs std-srvs message-generation mongodb-store-msgs rostest python3-catkin-pkg mongodb libmongoclient-dev openssl topic-tools geometry-msgs rospy roscpp std-msgs std-srvs python3-future python3-pymongo mongodb mongodb-store-msgs libmongoclient-dev topic-tools geometry-msgs"

RDEPENDS_${PN} = "rospy roscpp std-msgs std-srvs python3-future python3-pymongo mongodb mongodb-store-msgs libmongoclient-dev topic-tools geometry-msgs"

SRC_URI = "https://github.com/strands-project-releases/mongodb_store/archive/release/melodic/mongodb_store/0.5.1-2.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ef68dbfcd9aacbf29c00e5b5025ad64f"
SRC_URI[sha256sum] = "de20712e12deacf54f766d00dab28f3acbd48ac43790c63d0e418e0d01d864d9"

S = "${WORKDIR}/mongodb_store-release-melodic-mongodb_store-0.5.1-2"

inherit catkin

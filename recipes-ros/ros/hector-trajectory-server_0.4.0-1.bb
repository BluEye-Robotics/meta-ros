DESCRIPTION = "hector_trajectory_server keeps track of tf trajectories extracted from tf data and makes this data accessible via a service and topic."
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp hector-nav-msgs nav-msgs hector-map-tools tf roscpp hector-nav-msgs nav-msgs hector-map-tools tf"

RDEPENDS_${PN} = "roscpp hector-nav-msgs nav-msgs hector-map-tools tf"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_trajectory_server/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "48c6b45f598e02991ca17220d6a8fa64"
SRC_URI[sha256sum] = "39aca0f4b342351570b3940a8570985e9be7ca0a11b5ebd081d8a05cd7ac112b"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_trajectory_server-0.4.0-1"

inherit catkin

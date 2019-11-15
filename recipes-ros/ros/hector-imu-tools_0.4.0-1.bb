DESCRIPTION = "hector_imu_tools provides some tools for processing IMU messages"
AUTHOR = "Stefan Kohlbrecher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf geometry-msgs sensor-msgs nav-msgs roscpp tf geometry-msgs sensor-msgs nav-msgs"

RDEPENDS_${PN} = "roscpp tf geometry-msgs sensor-msgs nav-msgs"

SRC_URI = "https://github.com/tu-darmstadt-ros-pkg-gbp/hector_slam-release/archive/release/melodic/hector_imu_tools/0.4.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f546a46f85284825ab6a3a61d8c4c09d"
SRC_URI[sha256sum] = "c470a8781962710ca68058006428879639b57ce29649d2660ee10a6b09289ff5"

ROS_SPN = "hector_slam"
S = "${WORKDIR}/hector_slam-release-release-melodic-hector_imu_tools-0.4.0-1"

inherit catkin

DESCRIPTION = "ROS node to build a 3D map of fiducials and estimate robot pose from fiducial transforms"
AUTHOR = "Jim Vaughan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf2-geometry-msgs tf2-ros tf2 visualization-msgs image-transport sensor-msgs cv-bridge fiducial-msgs dynamic-reconfigure"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/melodic/fiducial_slam/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3170bf38f2bb171eb3abe1259419fe09"
SRC_URI[sha256sum] = "d7bb17f5b59c70f84500b9e64d53c3d254832b3a1b802f24649394cd687720e3"

ROS_SPN = "fiducials"
S = "${WORKDIR}/fiducials-release-release-melodic-fiducial_slam-0.11.0-1"

inherit catkin

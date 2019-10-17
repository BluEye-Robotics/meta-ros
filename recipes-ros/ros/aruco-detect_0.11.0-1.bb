DESCRIPTION = "Fiducial detection based on the aruco library"
AUTHOR = "Jim Vaughan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp tf2-geometry-msgs tf2-ros tf2 visualization-msgs image-transport sensor-msgs cv-bridge fiducial-msgs dynamic-reconfigure python3-cairosvg python3-joblib"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/UbiquityRobotics-release/fiducials-release/archive/release/melodic/aruco_detect/0.11.0-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "76217609f460d14d29441234fdd46622"
SRC_URI[sha256sum] = "850fff672ee87b14935c5dc431a7a77ce2e5cf8cf71e7f8dc326d224862a0abe"

ROS_SPN = "fiducials"
S = "${WORKDIR}/fiducials-release-release-melodic-aruco_detect-0.11.0-1"

inherit catkin

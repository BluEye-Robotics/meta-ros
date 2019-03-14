DESCRIPTION = "ROS-enabled OpenManipulator is a full open robot platform consisting of OpenSoftware​, OpenHardware and OpenCR(Embedded board)​. The OpenManipulator is allowed users to control it more easily by linking with the MoveIt! package. Moreover it has full hardware compatibility with TurtleBot3​. Even if you do not have a real robot, you can control the robot in the Gazebo simulator​."
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = ""

RDEPENDS_${PN} = "open-manipulator-control-gui open-manipulator-controller open-manipulator-description open-manipulator-libs open-manipulator-moveit open-manipulator-teleop"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator/2.0.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "740bdd3d4d4647af929a793f4b43bb3c"
SRC_URI[sha256sum] = "8de684b52de5da0e425146ae3a13c0ab79f047544aa163c5b3344b8df2284ea3"

S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator-2.0.1-0"

inherit catkin

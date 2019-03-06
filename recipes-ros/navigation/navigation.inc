SRC_URI = "https://github.com/ros-planning/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d50cbf429f12e91b0ba989f82fd3721b"
SRC_URI[sha256sum] = "d83201296e773e2789635fddf39ac18e9465219b18707e53bd2361de4762d205"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "navigation"
